package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.BlockPositionSource.class)
public class BlockPositionSource_901747917Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__6878352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-6878352L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1672171441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1672171441L))
            info.setReturnValue("\"P+O\uCBB0:/Fi\u7FE6Z'8;|g*9^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1459100007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1459100007L))
            info.setReturnValue(-718693377);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/gameevent/PositionSourceType;", cancellable = true)
    private void getType__1084285943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1084285943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1379028359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1379028359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosition(Lnet/minecraft/world/level/Level;)Ljava/util/Optional;", cancellable = true)
    private void getPosition__1753740692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1753740692L))
            info.setReturnValue(null);
    }


}
