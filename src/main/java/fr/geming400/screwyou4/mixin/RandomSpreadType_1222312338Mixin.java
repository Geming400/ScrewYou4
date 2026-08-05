package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType.class)
public class RandomSpreadType_1222312338Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/placement/RandomSpreadType;", cancellable = true)
    private static void values__938136553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-938136553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/placement/RandomSpreadType;", cancellable = true)
    private static void valueOf_825078330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(825078330L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType.TRIANGULAR);
    }

    @Inject(at = @At("HEAD"), method = "evaluate(Lnet/minecraft/util/RandomSource;I)I", cancellable = true)
    private void evaluate__128160176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-128160176L))
            info.setReturnValue(885603500);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_86851866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(86851866L))
            info.setReturnValue("#o厙'膬;");
    }


}
