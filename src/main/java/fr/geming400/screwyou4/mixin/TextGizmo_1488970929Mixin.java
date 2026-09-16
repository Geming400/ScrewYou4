package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.TextGizmo.class)
public class TextGizmo_1488970929Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_580344660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(580344660L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2035572843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035572843L))
            info.setReturnValue("v\u6F26g4qEQl\u669A%B\u5E56m|wCiRCBTfl\u946EC\u13DEz--EOqd\u5A29{cE8o\uFF17(x]C<-jH8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2046323019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2046323019L))
            info.setReturnValue(-1086940307);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void pos__327321643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-327321643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "text()Ljava/lang/String;", cancellable = true)
    private void text__774989402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-774989402L))
            info.setReturnValue("\u4FE7v9@Bf)fuhT?A\u17D9j\u8903L=+J$oY|l\uA238Uj\u5E1AYIAL\u3A50>;`9(ZElR+\uB769SB[0\u7298Hy%\uA460_T\u141A\u545F\u4A53-8]9l\u2718q|!kCl fq,_");
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/gizmos/TextGizmo$Style;", cancellable = true)
    private void style_1993562871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1993562871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emit(Lnet/minecraft/gizmos/GizmoPrimitives;F)V", cancellable = true)
    private void emit_1899068417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1899068417L))
            info.cancel();
    }


}
