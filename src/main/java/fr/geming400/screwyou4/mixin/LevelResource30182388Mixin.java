package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelResource.class)
public class LevelResource30182388Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1415694647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1415694647L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1105278083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1105278083L))
            info.setReturnValue("&jC]t:wka\u7305fmA9\uCD3Ax8(,8.Z}KI4A\u512DA^X4j;Emb");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_68445130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(68445130L))
            info.setReturnValue(1869205092);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id__1105278083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1105278083L))
            info.setReturnValue("&jC]t:wka\u7305fmA9\uCD3Ax8(,8.Z}KI4A\u512DA^X4j;Emb");
    }


}
