package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.EntityPositionSource.class)
public class EntityPositionSource_866685387Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/gameevent/PositionSourceType;", cancellable = true)
    private void getType_814238039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(814238039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosition(Lnet/minecraft/world/level/Level;)Ljava/util/Optional;", cancellable = true)
    private void getPosition__1011367639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1011367639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUuid()Ljava/util/UUID;", cancellable = true)
    private void getUuid_1277819869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1277819869L))
            info.setReturnValue(null);
    }


}
