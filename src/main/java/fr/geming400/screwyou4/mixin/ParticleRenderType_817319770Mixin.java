package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.ParticleRenderType.class)
public class ParticleRenderType_817319770Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1626586925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1626586925L))
            info.setReturnValue("n\u706Ct@if;\u04A9{9]^a\u039A^\u2E3C\u4566\u2470M5e>4wJ?t\uA53ERu\u32E2Wc{A");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__91306499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-91306499L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1587743294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1587743294L))
            info.setReturnValue("\"b]\uA77C\uC931;ML+Ch1)x-liGZh@/\uC7B2%$\uAC25CDya/g/8arR8Ce[Odu\u8154^xqf2Y?&2k");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1374671860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1374671860L))
            info.setReturnValue(-1027746767);
    }

    @Inject(at = @At("HEAD"), method = "shorthand()Ljava/lang/String;", cancellable = true)
    private void shorthand__774347891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-774347891L))
            info.setReturnValue("^RGR$]MOE^I&\u12F2");
    }


}
