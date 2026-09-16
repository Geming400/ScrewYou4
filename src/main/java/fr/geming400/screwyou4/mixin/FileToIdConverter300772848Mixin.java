package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.FileToIdConverter.class)
public class FileToIdConverter300772848Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__607853420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-607853420L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1071196373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1071196373L))
            info.setReturnValue("Gp\u1D0D4yX\uB2CEn5\uCB79\u14AF\uBC46`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_858124939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(858124939L))
            info.setReturnValue(1759750488);
    }

    @Inject(at = @At("HEAD"), method = "prefix()Ljava/lang/String;", cancellable = true)
    private void prefix_967591563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967591563L))
            info.setReturnValue("J>\u8E07.j\u866Fs\u6070+z[nOeV/K\u2311Yz*N-V.");
    }

    @Inject(at = @At("HEAD"), method = "extension()Ljava/lang/String;", cancellable = true)
    private void extension__319520648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-319520648L))
            info.setReturnValue("0`^tzBgUbN\u4C50[[bo$5f\uB9932r\u9A70,[WXmTP_\uBAB4/,#af\"b\u64CF6MY\u4164l=Q(bXV.V:\uD270#>=\u51E9|pN");
    }

    @Inject(at = @At("HEAD"), method = "registry(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/resources/FileToIdConverter;", cancellable = true)
    private static void registry_1076982205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1076982205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "json(Ljava/lang/String;)Lnet/minecraft/resources/FileToIdConverter;", cancellable = true)
    private static void json_1706908190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1706908190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extensionMatches(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void extensionMatches_1727075003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1727075003L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "fileToId(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void fileToId__973087423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-973087423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "idToFile(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void idToFile__630855615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-630855615L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listMatchingResourceStacks(Lnet/minecraft/server/packs/resources/ResourceManager;)Ljava/util/Map;", cancellable = true)
    private void listMatchingResourceStacks_1849783403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1849783403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listMatchingResources(Lnet/minecraft/server/packs/resources/ResourceManager;)Ljava/util/Map;", cancellable = true)
    private void listMatchingResources_592057269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592057269L))
            info.setReturnValue(null);
    }


}
