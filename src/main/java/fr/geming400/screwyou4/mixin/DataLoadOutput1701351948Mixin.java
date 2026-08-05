package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.WorldLoader.DataLoadOutput.class)
public class DataLoadOutput1701351948Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1208103089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1208103089L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_565891973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(565891973L))
            info.setReturnValue("\"tXሂ1唦s ;!V+pml+3. I팸O}WN<}1W渔<.KdRr6R왾1W*iᬛMRg@Q,t⠢^_xf9%Qv㩇I>檸bg6%ȼ5N3O).L#3గi^d硫cfdHSy");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1739614690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1739614690L))
            info.setReturnValue(1230217387);
    }

    @Inject(at = @At("HEAD"), method = "cookie()Ljava/lang/Object;", cancellable = true)
    private void cookie__734423129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-734423129L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "finalDimensions()Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void finalDimensions_1452601683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452601683L))
            info.setReturnValue(null);
    }


}
