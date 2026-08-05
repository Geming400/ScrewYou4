package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.ProfiledReloadInstance.State.class)
public class State_139886164Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__995574308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-995574308L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1525398422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1525398422L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__995573812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-995573812L))
            info.setReturnValue("K\u819Ei\uFCF5Ooud;t>,Vm)t\u6013!Zlu5we!^'&;zVA}Nd\uD66Epy(y\"yZra%\u05285!NPB?{Ow,8xX\"L2mf\u57E5uUkzm{LPBw\uFC52\u9119dG[>1`V\u5F50e");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_178148905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(178148905L))
            info.setReturnValue(925737342);
    }

    @Inject(at = @At("HEAD"), method = "reloadCount()Ljava/util/concurrent/atomic/AtomicLong;", cancellable = true)
    private void reloadCount__1176330578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1176330578L))
            info.setReturnValue(new java.util.concurrent.atomic.AtomicLong());
    }

    @Inject(at = @At("HEAD"), method = "preparationNanos()Ljava/util/concurrent/atomic/AtomicLong;", cancellable = true)
    private void preparationNanos__1176330578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1176330578L))
            info.setReturnValue(new java.util.concurrent.atomic.AtomicLong());
    }

    @Inject(at = @At("HEAD"), method = "reloadNanos()Ljava/util/concurrent/atomic/AtomicLong;", cancellable = true)
    private void reloadNanos__1176330578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1176330578L))
            info.setReturnValue(new java.util.concurrent.atomic.AtomicLong());
    }

    @Inject(at = @At("HEAD"), method = "preparationCount()Ljava/util/concurrent/atomic/AtomicLong;", cancellable = true)
    private void preparationCount__1176330578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1176330578L))
            info.setReturnValue(new java.util.concurrent.atomic.AtomicLong());
    }


}
