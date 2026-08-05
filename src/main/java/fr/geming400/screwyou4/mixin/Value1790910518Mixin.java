package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.Property.Value.class)
public class Value1790910518Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Comparable;", cancellable = true)
    private void value__244544042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-244544042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1118544519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1118544519L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_655450047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655450047L))
            info.setReturnValue("Gɛkmhiq-'崓⩦'+.g'?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1829173260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1829173260L))
            info.setReturnValue(-937451886);
    }

    @Inject(at = @At("HEAD"), method = "property()Lnet/minecraft/world/level/block/state/properties/Property;", cancellable = true)
    private void property_36091077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(36091077L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueName()Ljava/lang/String;", cancellable = true)
    private void valueName_655450047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655450047L))
            info.setReturnValue("Gɛkmhiq-'崓⩦'+.g'?");
    }


}
