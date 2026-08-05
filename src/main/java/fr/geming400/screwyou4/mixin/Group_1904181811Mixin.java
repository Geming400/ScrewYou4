package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives.Group.class)
public class Group_1904181811Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1005273227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1005273227L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_768721835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(768721835L))
            info.setReturnValue("<\u6C8BlO\uA38E)3QR2F_\u535A5S{B#N(\u6B45YC4,<#\u8CB7u&2Ri+z2?t<@*'p\u3291$SV)\uBA9FwRM\u9629OGo|\"g$\uC69Ac7F2jW<nF:zKnic");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1942444552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1942444552L))
            info.setReturnValue(2003014017);
    }

    @Inject(at = @At("HEAD"), method = "lines()Ljava/util/List;", cancellable = true)
    private void lines__764448670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764448670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "points()Ljava/util/List;", cancellable = true)
    private void points__764448670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764448670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triangleFans()Ljava/util/List;", cancellable = true)
    private void triangleFans__764448670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764448670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "opaque()Z", cancellable = true)
    private void opaque_1942460393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1942460393L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "texts()Ljava/util/List;", cancellable = true)
    private void texts__764448670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764448670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quads()Ljava/util/List;", cancellable = true)
    private void quads__764448670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764448670L))
            info.setReturnValue(null);
    }


}
