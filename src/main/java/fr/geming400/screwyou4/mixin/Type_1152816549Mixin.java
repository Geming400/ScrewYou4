package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.OceanRuinStructure.Type.class)
public class Type_1152816549Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_17356077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(17356077L))
            info.setReturnValue("}DA\u969D1\uBF29_/zy\u975CI>cZxOTEX\u777A[");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/structures/OceanRuinStructure$Type;", cancellable = true)
    private static void values__2039221214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2039221214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/structures/OceanRuinStructure$Type;", cancellable = true)
    private static void valueOf_1862379333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862379333L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.structures.OceanRuinStructure.Type.WARM);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_17356077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(17356077L))
            info.setReturnValue("}DA\u969D1\uBF29_/zy\u975CI>cZxOTEX\u777A[");
    }


}
