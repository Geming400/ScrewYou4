package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaLootTableProvider.class)
public class VanillaLootTableProvider426663102Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/data/PackOutput;Ljava/util/concurrent/CompletableFuture;)Lnet/minecraft/data/loot/LootTableProvider;", cancellable = true)
    private static void create_705741987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705741987L))
            info.setReturnValue(null);
    }


}
