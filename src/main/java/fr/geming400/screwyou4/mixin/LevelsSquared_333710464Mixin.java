package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.LevelBasedValue.LevelsSquared.class)
public class LevelsSquared_333710464Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1719222722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1719222722L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__801749512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-801749512L))
            info.setReturnValue("|W沉=}m038.sLuJ⠄^SiRWHir|xQ0_!(im?^[J");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_371973205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371973205L))
            info.setReturnValue(1311962546);
    }

    @Inject(at = @At("HEAD"), method = "added()F", cancellable = true)
    private void added_371969826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371969826L))
            info.setReturnValue(4.379932E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2069564187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2069564187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)F", cancellable = true)
    private void calculate_1547612059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1547612059L))
            info.setReturnValue(4.379932E8F);
    }


}
