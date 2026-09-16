package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.cow.CowVariant.class)
public class CowVariant_190234996Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__718391273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-718391273L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_960658520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(960658520L))
            info.setReturnValue("\u41EEJoBl3h\u5403-f\uA0F2\u3A8A8\u95F3>IJx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_747587086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747587086L))
            info.setReturnValue(-2002634932);
    }

    @Inject(at = @At("HEAD"), method = "spawnConditions()Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private void spawnConditions_2056209066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2056209066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babyTexture()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void babyTexture__582750348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-582750348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelAndTexture()Lnet/minecraft/world/entity/variant/ModelAndTexture;", cancellable = true)
    private void modelAndTexture__848948026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848948026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors__239438313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-239438313L))
            info.setReturnValue(null);
    }


}
