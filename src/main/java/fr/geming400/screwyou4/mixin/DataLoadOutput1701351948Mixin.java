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
            info.setReturnValue("\"tX\u12021\u5526s ;!V+pml+3. I\uD338O}WN<}1W\u6E14<.KdRr6R\uC67E1W*i\u1B1BMRg@Q,t\u2822^_xf9%Qv\u3A47I>\u6AB8bg6%\u023C5N3O).L#3\u0C17i^d\uF9CEcfdHSy");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1739614690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1739614690L))
            info.setReturnValue(1149481287);
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
