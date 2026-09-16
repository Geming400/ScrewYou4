package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives.Text.class)
public class Text1862201609Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_953575341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(953575341L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1662342162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1662342162L))
            info.setReturnValue("X;\u7084%|d\uB226K.t\u33A7O!N\u14AC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1875413596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1875413596L))
            info.setReturnValue(-29847160);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void pos_45909038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(45909038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "text()Ljava/lang/String;", cancellable = true)
    private void text__401758721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-401758721L))
            info.setReturnValue("a<:5v=h!aGsU\u3935zlPLV\u3834Df.`#}O.^mmlU+.VNRLfA*Ho{;J\u3AD9W<%.\uC665tB\u34A1Fr\uA853RBz%\u2FB3my2f(<zd>@$}<\u86E9?%Hx;uH4q)g)");
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/gizmos/TextGizmo$Style;", cancellable = true)
    private void style__1928173744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1928173744L))
            info.setReturnValue(null);
    }


}
