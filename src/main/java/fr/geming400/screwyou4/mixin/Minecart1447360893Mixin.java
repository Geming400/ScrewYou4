package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.Minecart.class)
public class Minecart1447360893Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1317677235(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1317677235L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact_440110765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(440110765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_1502290229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1502290229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "activateMinecart(Lnet/minecraft/server/level/ServerLevel;IIIZ)V", cancellable = true)
    private void activateMinecart__1830795252(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1830795252L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isRideable()Z", cancellable = true)
    private void isRideable__1309849832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1309849832L))
            info.setReturnValue(true);
    }


}
