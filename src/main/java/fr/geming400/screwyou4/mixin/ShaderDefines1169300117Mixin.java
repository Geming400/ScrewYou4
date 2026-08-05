package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.ShaderDefines.class)
public class ShaderDefines1169300117Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1740154920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740154920L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_33840142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(33840142L))
            info.setReturnValue("M✀*B>ye黛G娐=✌牌.ദszywQ8,힎y힆xU.A욞ꚿ/6WwjR蟬(`{L*f*X=䡪n^ꢬoVL诧&\"H8bcHx(");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/Map;", cancellable = true)
    private void values__835323523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-835323523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flags()Ljava/util/Set;", cancellable = true)
    private void flags__659735369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659735369L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1207562859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1207562859L))
            info.setReturnValue(-447280802);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1207578700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1207578700L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/client/renderer/ShaderDefines$Builder;", cancellable = true)
    private static void builder_582762147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582762147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOverrides(Lnet/minecraft/client/renderer/ShaderDefines;)Lnet/minecraft/client/renderer/ShaderDefines;", cancellable = true)
    private void withOverrides__441554814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-441554814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asSourceDirectives()Ljava/lang/String;", cancellable = true)
    private void asSourceDirectives_33839646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(33839646L))
            info.setReturnValue("\"᧱YPF짶AR[댁rO9''ꨨ1ᰢ&T㔁}N|䖆2_V3e8@U鄹5zẸ]CCZNVOUL칂2㾲3MC0sEm鯍E盒WჄl@Hak*晗e7");
    }


}
