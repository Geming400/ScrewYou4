package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.OceanRuinStructure.Type.class)
public class Type_1152816549Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__736030354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-736030354L))
            info.setReturnValue("]\u1B5EsPJ");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/structures/OceanRuinStructure$Type;", cancellable = true)
    private static void values__954328124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-954328124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/structures/OceanRuinStructure$Type;", cancellable = true)
    private static void valueOf__1274468579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274468579L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.structures.OceanRuinStructure.Type.COLD);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1241025170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1241025170L))
            info.setReturnValue("@.D&UoZ]eN2se$\u435B\u4150#");
    }


}
