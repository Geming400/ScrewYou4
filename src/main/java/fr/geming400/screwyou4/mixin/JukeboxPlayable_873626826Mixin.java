package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.JukeboxPlayable.class)
public class JukeboxPlayable_873626826Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__34999443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-34999443L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1644050350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1644050350L))
            info.setReturnValue("u3?;yYQ[+G1c2Z\u9B43ZR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1430978916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430978916L))
            info.setReturnValue(279748771);
    }

    @Inject(at = @At("HEAD"), method = "song()Lnet/minecraft/core/Holder;", cancellable = true)
    private void song_581246224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(581246224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1501593222(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1501593222L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryInsertIntoJukebox(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private static void tryInsertIntoJukebox_1340680666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1340680666L))
            info.setReturnValue(null);
    }


}
