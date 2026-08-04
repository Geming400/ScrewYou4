package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.NativeModuleLister.NativeModuleVersion.class)
public class NativeModuleVersion1394617629Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1514837408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1514837408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_259157158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259157158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "version()Ljava/lang/String;", cancellable = true)
    private void version_259157158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259157158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1432880371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432880371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_259157158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259157158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "company()Ljava/lang/String;", cancellable = true)
    private void company_259157158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259157158L))
            info.setReturnValue(null);
    }


}
