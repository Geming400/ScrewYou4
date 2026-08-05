package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetContainerContents.Builder.class)
public class Builder1714190086Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__576219010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-576219010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEntry(Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer$Builder;)Lnet/minecraft/world/level/storage/loot/functions/SetContainerContents$Builder;", cancellable = true)
    private void withEntry__420259022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-420259022L))
            info.setReturnValue(null);
    }


}
