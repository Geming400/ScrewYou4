package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.LootItemFunctions.class)
public class LootItemFunctions_1345870510Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void bootstrap__1932294131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1932294131L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compose(Ljava/util/List;)Ljava/util/function/BiFunction;", cancellable = true)
    private static void compose_1536845746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1536845746L))
            info.setReturnValue(null);
    }


}
