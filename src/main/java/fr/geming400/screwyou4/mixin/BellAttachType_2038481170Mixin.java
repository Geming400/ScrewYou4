package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.BellAttachType.class)
public class BellAttachType_2038481170Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/BellAttachType;", cancellable = true)
    private static void values_236496754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236496754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/BellAttachType;", cancellable = true)
    private static void valueOf__314638187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-314638187L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.BellAttachType.DOUBLE_WALL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_903020698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(903020698L))
            info.setReturnValue("s_CtN㸆h黤 Q㡻<ꜿ8X1{(0Bi|*tてN^7PWVAv$&{ᑡo9鈧a+3n/i<*<M䏼1㳴z0=]=!\")xwsGa98⭆H%gtvy1S=&t.LH⺟oX;ꂯX-凷 Z");
    }


}
