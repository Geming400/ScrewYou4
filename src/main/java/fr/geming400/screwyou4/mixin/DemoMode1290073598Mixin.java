package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.DemoMode.class)
public class DemoMode1290073598Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1160389940(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1160389940L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useItem(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useItem__342014911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-342014911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useItemOn(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/BlockHitResult;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useItemOn_1050794288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1050794288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleBlockBreakAction(Lnet/minecraft/core/BlockPos;Lnet/minecraft/network/protocol/game/ServerboundPlayerActionPacket$Action;Lnet/minecraft/core/Direction;II)V", cancellable = true)
    private void handleBlockBreakAction__1338624139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1338624139L))
            info.cancel();
    }


}
