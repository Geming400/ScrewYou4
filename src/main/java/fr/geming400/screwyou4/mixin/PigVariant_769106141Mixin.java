package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.pig.PigVariant.class)
public class PigVariant_769106141Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2140348897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2140348897L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__366353835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-366353835L))
            info.setReturnValue("2`V>T\"\u939DZ\u1DB3]p{A|\u677E\uC63FODG62\u94873\u8CD5xA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_807368882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807368882L))
            info.setReturnValue(200603266);
    }

    @Inject(at = @At("HEAD"), method = "spawnConditions()Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private void spawnConditions__137555706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137555706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babyTexture()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void babyTexture__483075080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-483075080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelAndTexture()Lnet/minecraft/world/entity/variant/ModelAndTexture;", cancellable = true)
    private void modelAndTexture_1597834210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1597834210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors__1899524340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1899524340L))
            info.setReturnValue(null);
    }


}
