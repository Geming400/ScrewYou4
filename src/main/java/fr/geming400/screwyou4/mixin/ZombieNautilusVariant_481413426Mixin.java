package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.nautilus.ZombieNautilusVariant.class)
public class ZombieNautilusVariant_481413426Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__427212843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-427212843L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1251836950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1251836950L))
            info.setReturnValue("b\u94BBF7K#\u50E0L(B8\u5A14(UnH\u1FA50w7\u0551\u8FDD(\u4D7AF\u0D6B\uD7E0$6\uA08E:0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1038765516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1038765516L))
            info.setReturnValue(-733596819);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors_51740117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(51740117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnConditions()Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private void spawnConditions__1947579800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1947579800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelAndTexture()Lnet/minecraft/world/entity/variant/ModelAndTexture;", cancellable = true)
    private void modelAndTexture__557769596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-557769596L))
            info.setReturnValue(null);
    }


}
