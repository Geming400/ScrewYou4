package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.StructureSpawnOverride.BoundingBoxType.class)
public class BoundingBoxType_1758561467Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/StructureSpawnOverride$BoundingBoxType;", cancellable = true)
    private static void values__2123809431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123809431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/StructureSpawnOverride$BoundingBoxType;", cancellable = true)
    private static void valueOf_936552204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(936552204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_623100995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(623100995L))
            info.setReturnValue(null);
    }


}
