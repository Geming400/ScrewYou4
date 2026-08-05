package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.ValidationContext.ParametersNotProvidedProblem.class)
public class ParametersNotProvidedProblem1597303585Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1312151452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1312151452L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_461843610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461843610L))
            info.setReturnValue("\u8201\u65EF5}5z\u471F\uD649\u58E0@zJMx/@x");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1635566327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1635566327L))
            info.setReturnValue(-2089529367);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_461843114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461843114L))
            info.setReturnValue("tD\u0C44UG1R\uBA77\u5A57)ZLZb?:#g-UdL\u576Ah\u5E07]&> ?|v*qOd\u6167\u4FA6E>\"cE\u3F53D\uA50F%iu>+\u904D+z&CK]KTW");
    }

    @Inject(at = @At("HEAD"), method = "notProvided()Ljava/util/Set;", cancellable = true)
    private void notProvided__231731901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-231731901L))
            info.setReturnValue(null);
    }


}
