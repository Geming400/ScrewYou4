package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration.class)
public class SimpleBlockConfiguration667303355Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__241322913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-241322913L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1437726880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437726880L))
            info.setReturnValue("T;oyH\u5416\uC83ER{\u194F\uFE74/\u0A85K,85[,`IQFY\"yoj\u4D35?U\u6B88]<f!a@Ll\uBAFAL\uB78CIm-\u54AF@P\u72F4Ty=8E \u6421jXe1\uCF23K(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1224655446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1224655446L))
            info.setReturnValue(-1151026);
    }

    @Inject(at = @At("HEAD"), method = "scheduleTick()Z", cancellable = true)
    private void scheduleTick__1918041314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918041314L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toPlace()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void toPlace_2013859650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013859650L))
            info.setReturnValue(null);
    }


}
