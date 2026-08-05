package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.StructureSpawnOverride.BoundingBoxType.class)
public class BoundingBoxType_1758561467Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/StructureSpawnOverride$BoundingBoxType;", cancellable = true)
    private static void values__1953315829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1953315829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/StructureSpawnOverride$BoundingBoxType;", cancellable = true)
    private static void valueOf__1427735836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427735836L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.StructureSpawnOverride.BoundingBoxType.PIECE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1846770088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846770088L))
            info.setReturnValue("!m4dB4l_\uF913\u7B00\u450D|4ra*\u85A5C\u4366t\uC01B=s\u9E6F\uAC69%?R|1|}p'I\uBA23o}ZYvo`VgD\uBDAE3_p(96Cxbb< '#fTA=b&P\u7873O9mh");
    }


}
