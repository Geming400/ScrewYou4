package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.HashCache.UpdateResult.class)
public class UpdateResult38592196Mixin {
        @Inject(at = @At("HEAD"), method = "cache()Lnet/minecraft/data/HashCache$ProviderCache;", cancellable = true)
    private void cache__1829689340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1829689340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__870034072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-870034072L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_809015721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809015721L))
            info.setReturnValue("'s\u423EGM#\u82F0WHt\u7F85JsBfh\"nA/1\u0D8D2\u2F36tyW[\uC3DF\uA407J\uD4A70\uFF8E)OH25umgk]@\u518B\"hi|XlHcE.+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_595944287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595944287L))
            info.setReturnValue(1084045412);
    }

    @Inject(at = @At("HEAD"), method = "writes()I", cancellable = true)
    private void writes__2000373578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2000373578L))
            info.setReturnValue(1415622401);
    }

    @Inject(at = @At("HEAD"), method = "providerId()Ljava/lang/String;", cancellable = true)
    private void providerId__1836172231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1836172231L))
            info.setReturnValue("y0");
    }


}
