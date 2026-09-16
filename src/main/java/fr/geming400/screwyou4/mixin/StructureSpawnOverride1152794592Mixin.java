package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.StructureSpawnOverride.class)
public class StructureSpawnOverride1152794592Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_244168324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(244168324L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1923218117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1923218117L))
            info.setReturnValue("l\u754E\u52A45?\u6B1Fkp\u231Fa\uAAB0p=/vt|XN\uA503e\u473A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1710146683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1710146683L))
            info.setReturnValue(343498336);
    }

    @Inject(at = @At("HEAD"), method = "boundingBox()Lnet/minecraft/world/level/levelgen/structure/StructureSpawnOverride$BoundingBoxType;", cancellable = true)
    private void boundingBox__735887735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-735887735L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.StructureSpawnOverride.BoundingBoxType.PIECE);
    }

    @Inject(at = @At("HEAD"), method = "spawns()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void spawns_722748318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(722748318L))
            info.setReturnValue(null);
    }


}
