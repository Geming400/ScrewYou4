package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.EntityPositionSource.class)
public class EntityPositionSource_866685387Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/gameevent/PositionSourceType;", cancellable = true)
    private void getType__1119348473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1119348473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosition(Lnet/minecraft/world/level/Level;)Ljava/util/Optional;", cancellable = true)
    private void getPosition__1788803222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1788803222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUuid()Ljava/util/UUID;", cancellable = true)
    private void getUuid__1439607410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1439607410L))
            info.setReturnValue(null);
    }


}
