package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.DebugStickState.class)
public class DebugStickState2011634550Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__897820487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-897820487L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_876174575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876174575L))
            info.setReturnValue("쬃XwL^?]+&+396XRᯟ_|.fX벛6VN0.駧2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2049897292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049897292L))
            info.setReturnValue(-595581658);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/Map;", cancellable = true)
    private void properties_7010910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(7010910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withProperty(Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/block/state/properties/Property;)Lnet/minecraft/world/item/component/DebugStickState;", cancellable = true)
    private void withProperty__1124385062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1124385062L))
            info.setReturnValue(null);
    }


}
