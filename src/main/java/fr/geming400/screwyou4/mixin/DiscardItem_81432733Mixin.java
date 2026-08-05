package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.DiscardItem.class)
public class DiscardItem_81432733Mixin {
        @Inject(at = @At("HEAD"), method = "discardItem()Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void discardItem__2030862989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2030862989L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1817286456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1817286456L))
            info.setReturnValue(null);
    }


}
