package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.ValidationContext.ReferenceNotAllowedProblem.class)
public class ReferenceNotAllowedProblem1056329837Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_147703569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(147703569L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1826753362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1826753362L))
            info.setReturnValue("-\uCE67N/nU1\u50ABx\uC55BihJf}JzDpn\u1FAFER}$84\uA05D;(Tw7\uCF40]ixqed\"9\u86E8\u17F6\u6194$8.T]'op");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1613681928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1613681928L))
            info.setReturnValue(-1497681720);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__117657870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-117657870L))
            info.setReturnValue("N4M,t8lMn[=Z&I+=FP2\u3BF6ic}\u07D4lB#z|-\u404AsW^oz\u3E11:\u36E7d+u\uA086w\u5893BZP\u56AB]Qt\u5F621P4z|_zWAa");
    }

    @Inject(at = @At("HEAD"), method = "referenced()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void referenced_506960709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(506960709L))
            info.setReturnValue(null);
    }


}
