package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.StringRepresentable.EnumCodec.class)
public class EnumCodec_1047584036Mixin {
        @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Ljava/lang/Enum;", cancellable = true)
    private void byName_959900850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(959900850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;Ljava/util/function/Supplier;)Ljava/lang/Enum;", cancellable = true)
    private void byName_648413938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648413938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;", cancellable = true)
    private void byName_1466683992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466683992L))
            info.setReturnValue(null);
    }


}
