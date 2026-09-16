package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.context.UseOnContext.class)
public class UseOnContext1541881971Mixin {
        @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/world/level/Level;", cancellable = true)
    private void getLevel__214438847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-214438847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemInHand()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItemInHand__1520089164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520089164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayer()Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private void getPlayer_1390876996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390876996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSecondaryUseActive()Z", cancellable = true)
    private void isSecondaryUseActive_704282855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704282855L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()F", cancellable = true)
    private void getRotation_625587874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625587874L))
            info.setReturnValue(3.138191E8F);
    }

    @Inject(at = @At("HEAD"), method = "getHorizontalDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getHorizontalDirection_821067843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821067843L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "getClickLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getClickLocation_335834981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(335834981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getClickedFace()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getClickedFace__1419527316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1419527316L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "getHand()Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private void getHand__249335134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-249335134L))
            info.setReturnValue(net.minecraft.world.InteractionHand.OFF_HAND);
    }

    @Inject(at = @At("HEAD"), method = "getClickedPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getClickedPos__749028943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-749028943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInside()Z", cancellable = true)
    private void isInside__1612595164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1612595164L))
            info.setReturnValue(true);
    }


}
