package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.FileToIdConverter.class)
public class FileToIdConverter300772848Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1686285107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1686285107L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__834687127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-834687127L))
            info.setReturnValue("$\u9E3C1bC9i(\u81D5v\u646D*6;)zo-JE#wv\u8D8FeWUqh.U\u20B72\u400F5/>,@d\u966B[X'RvFidZ\u16F5k9*AeH^S%E-j@)7G?8_\u2AF8nJ@[G\u51B2\u1BE9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_339035590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339035590L))
            info.setReturnValue(1524596570);
    }

    @Inject(at = @At("HEAD"), method = "prefix()Ljava/lang/String;", cancellable = true)
    private void prefix__834687623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-834687623L))
            info.setReturnValue("V\u912D`,Kc!Y3:)`\u3CF4AL;Uk\u25B3}>K86hOTYR'-x5W\u11FA+.9=+eG2KO*8KP,H9{KX+ynes&OKP]h<FEd4u+\"utTPV\u87BC\u64E7g");
    }

    @Inject(at = @At("HEAD"), method = "extension()Ljava/lang/String;", cancellable = true)
    private void extension__834687623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-834687623L))
            info.setReturnValue("V\u912D`,Kc!Y3:)`\u3CF4AL;Uk\u25B3}>K86hOTYR'-x5W\u11FA+.9=+eG2KO*8KP,H9{KX+ynes&OKP]h<FEd4u+\"utTPV\u87BC\u64E7g");
    }

    @Inject(at = @At("HEAD"), method = "listMatchingResources(Lnet/minecraft/server/packs/resources/ResourceManager;)Ljava/util/Map;", cancellable = true)
    private void listMatchingResources_1973584415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1973584415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "json(Ljava/lang/String;)Lnet/minecraft/resources/FileToIdConverter;", cancellable = true)
    private static void json_1262381574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262381574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registry(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/resources/FileToIdConverter;", cancellable = true)
    private static void registry_662120960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(662120960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fileToId(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void fileToId__1055193169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055193169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "idToFile(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void idToFile__1055193169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055193169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listMatchingResourceStacks(Lnet/minecraft/server/packs/resources/ResourceManager;)Ljava/util/Map;", cancellable = true)
    private void listMatchingResourceStacks_1973584415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1973584415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extensionMatches(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void extensionMatches__1193664465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1193664465L))
            info.setReturnValue(true);
    }


}
