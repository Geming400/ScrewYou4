package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.FileToUpgrade.class)
public class FileToUpgrade_455031737Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__453594532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453594532L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1225455261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1225455261L))
            info.setReturnValue("ROv WG56[)aiEz=5+!q_=MK\"ij*8f\u50DB\"mQ\u9DA4Ab|\uB39D\u5B79i 4!9{cW]\u21A9GV1E0q\u6CC9C?CE^ x@\uBBEBK\uD687` +S(\u0B86B$ez:)Z<kIG+\u4724{1;i\u318E\u4E71HzW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1012383827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012383827L))
            info.setReturnValue(1864541938);
    }

    @Inject(at = @At("HEAD"), method = "file()Lnet/minecraft/world/level/chunk/storage/RegionFile;", cancellable = true)
    private void file__199203936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-199203936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunksToUpgrade()Ljava/util/List;", cancellable = true)
    private void chunksToUpgrade_55816323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(55816323L))
            info.setReturnValue(null);
    }


}
