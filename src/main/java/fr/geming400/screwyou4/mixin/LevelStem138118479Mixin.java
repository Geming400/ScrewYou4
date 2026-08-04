package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.dimension.LevelStem.class)
public class LevelStem138118479Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/Holder;", cancellable = true)
    private void type_1686994251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1686994251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1523630738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1523630738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__997341496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-997341496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_176381221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(176381221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generator()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void generator__1658873927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1658873927L))
            info.setReturnValue(null);
    }


}
