package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.JukeboxPlayable.class)
public class JukeboxPlayable_873626826Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2035828212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035828212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__261833150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-261833150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_911889567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(911889567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "song()Lnet/minecraft/core/Holder;", cancellable = true)
    private void song__1872464699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1872464699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1669091565(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1669091565L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryInsertIntoJukebox(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private static void tryInsertIntoJukebox_1337195116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1337195116L))
            info.setReturnValue(null);
    }


}
