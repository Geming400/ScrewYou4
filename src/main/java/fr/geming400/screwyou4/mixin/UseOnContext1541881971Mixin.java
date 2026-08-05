package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.context.UseOnContext.class)
public class UseOnContext1541881971Mixin {
        @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/world/level/Level;", cancellable = true)
    private void getLevel__1034386097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034386097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()F", cancellable = true)
    private void getRotation_1580141334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580141334L))
            info.setReturnValue(7.711092E8F);
    }

    @Inject(at = @At("HEAD"), method = "getHorizontalDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getHorizontalDirection_779026686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779026686L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "getClickedFace()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getClickedFace_779026686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779026686L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "getClickLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getClickLocation__1655355796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1655355796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayer()Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private void getPlayer_494795693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(494795693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInside()Z", cancellable = true)
    private void isInside_1580160554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580160554L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isSecondaryUseActive()Z", cancellable = true)
    private void isSecondaryUseActive_1580160554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580160554L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getClickedPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getClickedPos__351504908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-351504908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemInHand()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItemInHand_2065300631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2065300631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHand()Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private void getHand__1899096601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1899096601L))
            info.setReturnValue(net.minecraft.world.InteractionHand.OFF_HAND);
    }


}
