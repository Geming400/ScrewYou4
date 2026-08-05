package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.GenerationStep.Decoration.class)
public class Decoration1477039962Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__411806940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-411806940L))
            info.setReturnValue("<#9afsnaMprj>Q+\u2477,CDq@$Cfw6\u3CD3");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/GenerationStep$Decoration;", cancellable = true)
    private static void values__1678181490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1678181490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/GenerationStep$Decoration;", cancellable = true)
    private static void valueOf_692176085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(692176085L))
            info.setReturnValue(net.minecraft.world.level.levelgen.GenerationStep.Decoration.LAKES);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1565248584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1565248584L))
            info.setReturnValue("T;IY5\u3BC7vQW[f?eI");
    }


}
