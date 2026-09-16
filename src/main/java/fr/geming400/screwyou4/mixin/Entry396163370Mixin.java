package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.SuspiciousStewEffects.Entry.class)
public class Entry396163370Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__512462898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-512462898L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1166586895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166586895L))
            info.setReturnValue("\uFA5CpDsxg5e5}+<\u5B24Iv,)_QO;\u7104Sjv-!).^C:r");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_953515461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(953515461L))
            info.setReturnValue(-1115262716);
    }

    @Inject(at = @At("HEAD"), method = "duration()I", cancellable = true)
    private void duration_483778044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(483778044L))
            info.setReturnValue(956251986);
    }

    @Inject(at = @At("HEAD"), method = "effect()Lnet/minecraft/core/Holder;", cancellable = true)
    private void effect__24820363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-24820363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createEffectInstance()Lnet/minecraft/world/effect/MobEffectInstance;", cancellable = true)
    private void createEffectInstance_465899169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(465899169L))
            info.setReturnValue(null);
    }


}
