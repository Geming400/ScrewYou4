package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.MinMaxBounds.FloatDegrees.class)
public class FloatDegrees892027986Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2017427051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2017427051L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__243431989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-243431989L))
            info.setReturnValue("<VF\u874Ag%v7cl\u55E56\u7E38<9H\u46F3`17#5qNNM>D:R^T_x|G*:^9F%l\uB741[hk/B4\uB912\u8DFCk:m<^jd\uCD26\uB6C8|1\u8D70\u84D2nr='|KW\u687FeJX$\u82FBLJ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_930290728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(930290728L))
            info.setReturnValue(1533657419);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private void bounds__443776465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-443776465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromReader(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/advancements/predicates/MinMaxBounds$FloatDegrees;", cancellable = true)
    private static void fromReader_197113659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(197113659L))
            info.setReturnValue(null);
    }


}
