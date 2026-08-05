package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.StringRepresentable.EnumCodec.class)
public class EnumCodec_1047584036Mixin {
        @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Ljava/lang/Enum;", cancellable = true)
    private void byName_575419060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(575419060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;Ljava/util/function/Supplier;)Ljava/lang/Enum;", cancellable = true)
    private void byName_704107568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704107568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;", cancellable = true)
    private void byName__1970744230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1970744230L))
            info.setReturnValue(null);
    }


}
