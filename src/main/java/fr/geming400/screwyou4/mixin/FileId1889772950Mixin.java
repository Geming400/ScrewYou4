package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.eventlog.EventLogDirectory.FileId.class)
public class FileId1889772950Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index__1711077910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1711077910L))
            info.setReturnValue(-114753933);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_981146682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(981146682L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1634771317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1634771317L))
            info.setReturnValue("nY\"R83Z&,}T7K:Ft?Bm\uB55DnJ-/d\"4|K+p2\u2A92Y:5WP\uB714'l");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1847842255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847842255L))
            info.setReturnValue(1280051105);
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/lang/String;)Lnet/minecraft/util/eventlog/EventLogDirectory$FileId;", cancellable = true)
    private static void parse__119034847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-119034847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "date()Ljava/time/LocalDate;", cancellable = true)
    private void date_412206568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(412206568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toFileName(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void toFileName_636469783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(636469783L))
            info.setReturnValue("d'[9'q[9i0C=2 Z+6\u7924q\u0817H>q\u2AD99h31$&\uD6A7P%,UxQ\u7265yE=6\u61C7&+\u029D\u385CR\u86E5YZ58zY%dJOZ3\uCB2A\u350Fiz$f\"|@1:pI]\u01CE\uB7CARK3Pk_#\"");
    }


}
