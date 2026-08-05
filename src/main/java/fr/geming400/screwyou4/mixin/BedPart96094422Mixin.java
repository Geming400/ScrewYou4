package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.BedPart.class)
public class BedPart96094422Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_866517451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866517451L))
            info.setReturnValue("S8:IQPU\u18D8\u8223$`MS\u8A1EQmJ?B\uB3D80h+\u967C{q$d>!aM!;n8\u12A4Iq96rzk\u2BEE\u5AAD'v\u3E82L7bG8?\"iaaZ");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/BedPart;", cancellable = true)
    private static void values_846337759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846337759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/BedPart;", cancellable = true)
    private static void valueOf__72836186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-72836186L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.BedPart.FOOT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_184303044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(184303044L))
            info.setReturnValue("n(1'\uC051\u4B03nb<`o,-YV5$&)o;QR`[\u4F6F\"$C.fH^4q\u67F8<;\u2267xx(cFBj\uD0FA\"P/A");
    }


}
