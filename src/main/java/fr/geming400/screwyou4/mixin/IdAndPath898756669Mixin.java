package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.server.PackReloadConfig.IdAndPath.class)
public class IdAndPath898756669Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2010698368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2010698368L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__236703306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-236703306L))
            info.setReturnValue("p/൭얥XTs-r[&8x9゙\"C量nOM1|z+MDnA爐");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_937019411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937019411L))
            info.setReturnValue(1988751237);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/UUID;", cancellable = true)
    private void id_1309891152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1309891152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "path()Ljava/nio/file/Path;", cancellable = true)
    private void path__235607013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-235607013L))
            info.setReturnValue(null);
    }


}
