package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.StateDefinition.class)
public class StateDefinition506855062Mixin {
        @Inject(at = @At("HEAD"), method = "getProperty(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/Property;", cancellable = true)
    private void getProperty_1227108015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1227108015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__628605409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-628605409L))
            info.setReturnValue("7i\"d/M4QU!8H^0t");
    }

    @Inject(at = @At("HEAD"), method = "getProperties()Ljava/util/Collection;", cancellable = true)
    private void getProperties__1306793210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1306793210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOwner()Ljava/lang/Object;", cancellable = true)
    private void getOwner__1928920015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1928920015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "any()Lnet/minecraft/world/level/block/state/StateHolder;", cancellable = true)
    private void any__2112105351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2112105351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSingletonState()Z", cancellable = true)
    private void isSingletonState_545133645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(545133645L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPossibleStates()Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private void getPossibleStates_1474633595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1474633595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "propertiesCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void propertiesCodec__2052258510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2052258510L))
            info.setReturnValue(null);
    }


}
