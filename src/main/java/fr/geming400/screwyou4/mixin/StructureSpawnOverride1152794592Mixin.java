package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.StructureSpawnOverride.class)
public class StructureSpawnOverride1152794592Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1756660445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1756660445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_17334617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(17334617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1191057334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1191057334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "boundingBox()Lnet/minecraft/world/level/levelgen/structure/StructureSpawnOverride$BoundingBoxType;", cancellable = true)
    private void boundingBox__2133230032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133230032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawns()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void spawns_646310726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646310726L))
            info.setReturnValue(null);
    }


}
