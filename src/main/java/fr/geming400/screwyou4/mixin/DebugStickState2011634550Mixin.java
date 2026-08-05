package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.DebugStickState.class)
public class DebugStickState2011634550Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1103008282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1103008282L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1512909221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1512909221L))
            info.setReturnValue("e,pAi%1z F\uC973\uA9F4a");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1725980655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1725980655L))
            info.setReturnValue(-1312780724);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/Map;", cancellable = true)
    private void properties_718144075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(718144075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withProperty(Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/block/state/properties/Property;)Lnet/minecraft/world/item/component/DebugStickState;", cancellable = true)
    private void withProperty_712505429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712505429L))
            info.setReturnValue(null);
    }


}
